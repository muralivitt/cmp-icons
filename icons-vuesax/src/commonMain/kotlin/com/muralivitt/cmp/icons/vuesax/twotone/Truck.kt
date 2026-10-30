package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.Truck: ImageVector
    get() {
        if (_Truck != null) {
            return _Truck!!
        }
        _Truck = ImageVector.Builder(
            name = "Truck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                verticalLineTo(12f)
                curveTo(15f, 13.1f, 14.1f, 14f, 13f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                curveTo(2f, 3.79f, 3.79f, 2f, 6f, 2f)
                horizontalLineTo(15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 14f)
                verticalLineTo(17f)
                curveTo(22f, 18.66f, 20.66f, 20f, 19f, 20f)
                horizontalLineTo(18f)
                curveTo(18f, 18.9f, 17.1f, 18f, 16f, 18f)
                curveTo(14.9f, 18f, 14f, 18.9f, 14f, 20f)
                horizontalLineTo(10f)
                curveTo(10f, 18.9f, 9.1f, 18f, 8f, 18f)
                curveTo(6.9f, 18f, 6f, 18.9f, 6f, 20f)
                horizontalLineTo(5f)
                curveTo(3.34f, 20f, 2f, 18.66f, 2f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                curveTo(14.1f, 14f, 15f, 13.1f, 15f, 12f)
                verticalLineTo(5f)
                horizontalLineTo(16.84f)
                curveTo(17.56f, 5f, 18.22f, 5.39f, 18.58f, 6.01f)
                lineTo(20.29f, 9f)
                horizontalLineTo(19f)
                curveTo(18.45f, 9f, 18f, 9.45f, 18f, 10f)
                verticalLineTo(13f)
                curveTo(18f, 13.55f, 18.45f, 14f, 19f, 14f)
                horizontalLineTo(22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 22f)
                curveTo(9.105f, 22f, 10f, 21.105f, 10f, 20f)
                curveTo(10f, 18.895f, 9.105f, 18f, 8f, 18f)
                curveTo(6.895f, 18f, 6f, 18.895f, 6f, 20f)
                curveTo(6f, 21.105f, 6.895f, 22f, 8f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 22f)
                curveTo(17.105f, 22f, 18f, 21.105f, 18f, 20f)
                curveTo(18f, 18.895f, 17.105f, 18f, 16f, 18f)
                curveTo(14.895f, 18f, 14f, 18.895f, 14f, 20f)
                curveTo(14f, 21.105f, 14.895f, 22f, 16f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                curveTo(18.45f, 14f, 18f, 13.55f, 18f, 13f)
                verticalLineTo(10f)
                curveTo(18f, 9.45f, 18.45f, 9f, 19f, 9f)
                horizontalLineTo(20.29f)
                lineTo(22f, 12f)
                close()
            }
        }.build()

        return _Truck!!
    }

@Suppress("ObjectPropertyName")
private var _Truck: ImageVector? = null
