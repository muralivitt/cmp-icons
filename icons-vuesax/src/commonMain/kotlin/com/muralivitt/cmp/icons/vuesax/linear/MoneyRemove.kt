package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MoneyRemove: ImageVector
    get() {
        if (_MoneyRemove != null) {
            return _MoneyRemove!!
        }
        _MoneyRemove = ImageVector.Builder(
            name = "MoneyRemove",
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
                moveTo(2f, 15.3f)
                verticalLineTo(9f)
                curveTo(2f, 5.5f, 4f, 4f, 7f, 4f)
                horizontalLineTo(17f)
                curveTo(20f, 4f, 22f, 5.5f, 22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 18.5f, 20f, 20f, 17f, 20f)
                horizontalLineTo(8.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14.5f)
                curveTo(13.381f, 14.5f, 14.5f, 13.381f, 14.5f, 12f)
                curveTo(14.5f, 10.619f, 13.381f, 9.5f, 12f, 9.5f)
                curveTo(10.619f, 9.5f, 9.5f, 10.619f, 9.5f, 12f)
                curveTo(9.5f, 13.381f, 10.619f, 14.5f, 12f, 14.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 9.5f)
                verticalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                curveTo(9f, 18.75f, 8.79f, 19.46f, 8.42f, 20.06f)
                curveTo(7.73f, 21.22f, 6.46f, 22f, 5f, 22f)
                curveTo(3.54f, 22f, 2.27f, 21.22f, 1.58f, 20.06f)
                curveTo(1.21f, 19.46f, 1f, 18.75f, 1f, 18f)
                curveTo(1f, 15.79f, 2.79f, 14f, 5f, 14f)
                curveTo(7.21f, 14f, 9f, 15.79f, 9f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.071f, 19.04f)
                lineTo(3.961f, 16.93f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.04f, 16.96f)
                lineTo(3.93f, 19.07f)
            }
        }.build()

        return _MoneyRemove!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyRemove: ImageVector? = null
