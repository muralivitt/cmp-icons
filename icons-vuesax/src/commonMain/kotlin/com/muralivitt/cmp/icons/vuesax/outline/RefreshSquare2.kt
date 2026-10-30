package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.RefreshSquare2: ImageVector
    get() {
        if (_RefreshSquare2 != null) {
            return _RefreshSquare2!!
        }
        _RefreshSquare2 = ImageVector.Builder(
            name = "RefreshSquare2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 12f)
                curveTo(17.5f, 15.04f, 15.04f, 17.5f, 12f, 17.5f)
                curveTo(8.96f, 17.5f, 7.11f, 14.44f, 7.11f, 14.44f)
                moveTo(7.11f, 14.44f)
                horizontalLineTo(9.59f)
                moveTo(7.11f, 14.44f)
                verticalLineTo(17.19f)
                moveTo(6.5f, 12f)
                curveTo(6.5f, 8.96f, 8.94f, 6.5f, 12f, 6.5f)
                curveTo(15.67f, 6.5f, 17.5f, 9.56f, 17.5f, 9.56f)
                moveTo(17.5f, 9.56f)
                verticalLineTo(6.81f)
                moveTo(17.5f, 9.56f)
                horizontalLineTo(15.06f)
            }
        }.build()

        return _RefreshSquare2!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshSquare2: ImageVector? = null
