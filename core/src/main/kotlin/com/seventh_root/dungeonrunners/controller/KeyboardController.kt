package com.seventh_root.dungeonrunners.controller

import com.badlogic.gdx.Gdx.input


class KeyboardController(val keyboardMapping: KeyboardMapping = KeyboardMapping()): Controller() {

    override fun tick() {
        var x = 0F
        var y = 0F
        if (input.isKeyPressed(keyboardMapping.upKey)) {
            y += 1F
        }
        if (input.isKeyPressed(keyboardMapping.leftKey)) {
            x -= 1F
        }
        if (input.isKeyPressed(keyboardMapping.downKey)) {
            y -= 1F
        }
        if (input.isKeyPressed(keyboardMapping.rightKey)) {
            x += 1F
        }
        linearVelocity.set(x, y)
    }

}