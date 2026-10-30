package com.muralivitt.cmp.icons.vuesax.extra

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VuesaxExtra.DoubleTick: ImageVector
    get() {
        if (_DoubleTick != null) {
            return _DoubleTick!!
        }
        _DoubleTick = ImageVector.Builder(
            name = "DoubleTickSvgrepoCom",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 25f,
            viewportHeight = 25f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.03f, 11.97f)
                curveTo(4.737f, 11.677f, 4.263f, 11.677f, 3.97f, 11.97f)
                curveTo(3.677f, 12.263f, 3.677f, 12.737f, 3.97f, 13.03f)
                lineTo(5.03f, 11.97f)
                close()
                moveTo(8.5f, 16.5f)
                lineTo(7.97f, 17.03f)
                curveTo(8.263f, 17.323f, 8.737f, 17.323f, 9.03f, 17.03f)
                lineTo(8.5f, 16.5f)
                close()
                moveTo(17.03f, 9.03f)
                curveTo(17.323f, 8.737f, 17.323f, 8.263f, 17.03f, 7.97f)
                curveTo(16.737f, 7.677f, 16.263f, 7.677f, 15.97f, 7.97f)
                lineTo(17.03f, 9.03f)
                close()
                moveTo(9.03f, 11.97f)
                curveTo(8.737f, 11.677f, 8.263f, 11.677f, 7.97f, 11.97f)
                curveTo(7.677f, 12.263f, 7.677f, 12.737f, 7.97f, 13.03f)
                lineTo(9.03f, 11.97f)
                close()
                moveTo(12.5f, 16.5f)
                lineTo(11.97f, 17.03f)
                curveTo(12.263f, 17.323f, 12.737f, 17.323f, 13.03f, 17.03f)
                lineTo(12.5f, 16.5f)
                close()
                moveTo(21.03f, 9.03f)
                curveTo(21.323f, 8.737f, 21.323f, 8.263f, 21.03f, 7.97f)
                curveTo(20.737f, 7.677f, 20.263f, 7.677f, 19.97f, 7.97f)
                lineTo(21.03f, 9.03f)
                close()
                moveTo(3.97f, 13.03f)
                lineTo(7.97f, 17.03f)
                lineTo(9.03f, 15.97f)
                lineTo(5.03f, 11.97f)
                lineTo(3.97f, 13.03f)
                close()
                moveTo(9.03f, 17.03f)
                lineTo(17.03f, 9.03f)
                lineTo(15.97f, 7.97f)
                lineTo(7.97f, 15.97f)
                lineTo(9.03f, 17.03f)
                close()
                moveTo(7.97f, 13.03f)
                lineTo(11.97f, 17.03f)
                lineTo(13.03f, 15.97f)
                lineTo(9.03f, 11.97f)
                lineTo(7.97f, 13.03f)
                close()
                moveTo(13.03f, 17.03f)
                lineTo(21.03f, 9.03f)
                lineTo(19.97f, 7.97f)
                lineTo(11.97f, 15.97f)
                lineTo(13.03f, 17.03f)
                close()
            }
        }.build()

        return _DoubleTick!!
    }

@Suppress("ObjectPropertyName")
private var _DoubleTick: ImageVector? = null
