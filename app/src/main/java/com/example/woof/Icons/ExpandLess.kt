package com.example.woof.Icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector

val Icons.Filled.ExpandLess: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = materialIcon(name = "Filled.ExpandMore") {
            materialPath {
                moveTo(12f, 8f)
                lineToRelative(-6f, 6f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12f, 10.83f)
                lineToRelative(4.59f, 4.58f)
                lineTo(18f, 14f)
                close()
            }
        }
        return _close!!
    }

private var _close: ImageVector? = null
