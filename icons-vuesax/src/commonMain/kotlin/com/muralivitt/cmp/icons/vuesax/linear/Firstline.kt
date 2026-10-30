package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Firstline: ImageVector
    get() {
        if (_Firstline != null) {
            return _Firstline!!
        }
        _Firstline = ImageVector.Builder(
            name = "Firstline",
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
                moveTo(14f, 4.5f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 9.5f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 14.5f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 19.5f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 8.43f)
                verticalLineTo(5.57f)
                curveTo(9.5f, 4.45f, 9.05f, 4f, 7.92f, 4f)
                horizontalLineTo(5.07f)
                curveTo(3.95f, 4f, 3.5f, 4.45f, 3.5f, 5.57f)
                verticalLineTo(8.42f)
                curveTo(3.5f, 9.55f, 3.95f, 10f, 5.07f, 10f)
                horizontalLineTo(7.92f)
                curveTo(9.05f, 10f, 9.5f, 9.55f, 9.5f, 8.43f)
                close()
            }
        }.build()

        return _Firstline!!
    }

@Suppress("ObjectPropertyName")
private var _Firstline: ImageVector? = null
