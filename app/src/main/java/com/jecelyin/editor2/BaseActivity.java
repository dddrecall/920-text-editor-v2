/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
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

package com.jecelyin.editor2;

import com.jecelyin.common.app.JecActivity;
import com.jecelyin.common.app.JecApp;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */

public class BaseActivity extends JecActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ((JecApp)getApplication()).watch(this);
    }

}
