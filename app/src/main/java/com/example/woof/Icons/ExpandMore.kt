package com.example.woof.Icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector

val Icons.Filled.ExpandMore: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = materialIcon(name = "Filled.ExpandMore") {
            materialPath {
                moveTo(16.59f, 8.59f)
                lineTo(12f, 13.17f)
                lineTo(7.41f, 8.59f)
                lineTo(6f, 10f)
                lineToRelative(6f, 6f)
                lineToRelative(6f, -6f)
                close()
            }
        }
        return _close!!
    }

private var _close: ImageVector? = null
