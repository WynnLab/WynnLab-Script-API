package com.wynnlab.classes.mage

import com.wynnlab.classes.BaseClass

object Mage : BaseClass() {
    override val spells = listOf(
        Spell() { MageMain(it) }
    )
}