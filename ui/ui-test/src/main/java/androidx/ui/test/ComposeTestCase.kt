/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.ui.test

import androidx.compose.Composable

/**
 * To be implemented to provide a test case that is then executed by [ComposeTestRule] or can be
 * used in benchmarks.
 */
interface ComposeTestCase {
    /**
     * This method is guaranteed to be called only once per class lifetime. In case a benchmark
     * needs to measure initial composition / measure / layout / draw it re-creates this class
     * every time it needs to call emitContent again. This ensures that any setup you do in this
     * class is not shared between multiple calls of this method. So the init method is a good place
     * to setup / clean your caches.
     */
    @Composable
    fun emitContent()
}
