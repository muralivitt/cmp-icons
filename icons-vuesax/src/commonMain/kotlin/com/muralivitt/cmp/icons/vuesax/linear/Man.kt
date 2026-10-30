package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Man: ImageVector
    get() {
        if (_Man != null) {
            return _Man!!
        }
        _Man = ImageVector.Builder(
            name = "Man",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.25f, 21.5f)
                curveTo(14.53f, 21.5f, 18f, 18.03f, 18f, 13.75f)
                curveTo(18f, 9.47f, 14.53f, 6f, 10.25f, 6f)
                curveTo(5.97f, 6f, 2.5f, 9.47f, 2.5f, 13.75f)
                curveTo(2.5f, 18.03f, 5.97f, 21.5f, 10.25f, 21.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.5f, 2.5f)
                lineTo(16f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2.5f)
                horizontalLineTo(21.5f)
                verticalLineTo(9f)
            }
        }.build()

        return _Man!!
    }

@Suppress("ObjectPropertyName")
private var _Man: ImageVector? = null
