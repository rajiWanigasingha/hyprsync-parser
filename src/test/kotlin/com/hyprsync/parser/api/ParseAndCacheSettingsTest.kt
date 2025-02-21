package com.hyprsync.parser.api

import kotlin.test.Test

class ParseAndCacheSettingsTest {

    @Test
    fun `Parse and generate hyprland settings`() {
        ParseAndCacheSettings().create()
    }

}