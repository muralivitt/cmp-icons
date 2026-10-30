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

val VuesaxIconsTwotone.CardTick: ImageVector
    get() {
        if (_CardTick != null) {
            return _CardTick!!
        }
        _CardTick = ImageVector.Builder(
            name = "CardTick",
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
                moveTo(2f, 10f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.55f, 20.5f)
                horizontalLineTo(6.44f)
                curveTo(2.89f, 20.5f, 1.99f, 19.62f, 1.99f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(1.99f, 4.71f, 2.73f, 3.69f, 5.52f, 3.53f)
                curveTo(5.8f, 3.52f, 6.11f, 3.51f, 6.44f, 3.51f)
                horizontalLineTo(17.55f)
                curveTo(21.1f, 3.51f, 22f, 4.39f, 22f, 7.9f)
                verticalLineTo(12.31f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16f)
                horizontalLineTo(10f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 18f)
                curveTo(22f, 18.75f, 21.79f, 19.46f, 21.42f, 20.06f)
                curveTo(20.73f, 21.22f, 19.46f, 22f, 18f, 22f)
                curveTo(16.54f, 22f, 15.27f, 21.22f, 14.58f, 20.06f)
                curveTo(14.21f, 19.46f, 14f, 18.75f, 14f, 18f)
                curveTo(14f, 15.79f, 15.79f, 14f, 18f, 14f)
                curveTo(20.21f, 14f, 22f, 15.79f, 22f, 18f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.44f, 18f)
                lineTo(17.429f, 18.99f)
                lineTo(19.559f, 17.02f)
            }
        }.build()

        return _CardTick!!
    }

@Suppress("ObjectPropertyName")
private var _CardTick: ImageVector? = null
