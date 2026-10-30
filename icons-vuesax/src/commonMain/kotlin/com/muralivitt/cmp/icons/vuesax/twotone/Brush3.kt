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

val VuesaxIconsTwotone.Brush3: ImageVector
    get() {
        if (_Brush3 != null) {
            return _Brush3!!
        }
        _Brush3 = ImageVector.Builder(
            name = "Brush3",
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
                moveTo(9.5f, 19.5f)
                verticalLineTo(18f)
                horizontalLineTo(4.5f)
                curveTo(3.95f, 18f, 3.45f, 17.78f, 3.09f, 17.41f)
                curveTo(2.72f, 17.05f, 2.5f, 16.55f, 2.5f, 16f)
                curveTo(2.5f, 14.97f, 3.3f, 14.11f, 4.31f, 14.01f)
                curveTo(4.37f, 14f, 4.43f, 14f, 4.5f, 14f)
                horizontalLineTo(19.5f)
                curveTo(19.57f, 14f, 19.63f, 14f, 19.69f, 14.01f)
                curveTo(20.17f, 14.05f, 20.59f, 14.26f, 20.91f, 14.59f)
                curveTo(21.32f, 14.99f, 21.54f, 15.56f, 21.49f, 16.18f)
                curveTo(21.4f, 17.23f, 20.45f, 18f, 19.39f, 18f)
                horizontalLineTo(14.5f)
                verticalLineTo(19.5f)
                curveTo(14.5f, 20.88f, 13.38f, 22f, 12f, 22f)
                curveTo(10.62f, 22f, 9.5f, 20.88f, 9.5f, 19.5f)
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
                moveTo(20.17f, 5.3f)
                lineTo(19.69f, 14.01f)
                curveTo(19.63f, 14f, 19.57f, 14f, 19.5f, 14f)
                horizontalLineTo(4.5f)
                curveTo(4.43f, 14f, 4.37f, 14f, 4.31f, 14.01f)
                lineTo(3.83f, 5.3f)
                curveTo(3.65f, 3.53f, 5.04f, 2f, 6.81f, 2f)
                horizontalLineTo(17.19f)
                curveTo(18.96f, 2f, 20.35f, 3.53f, 20.17f, 5.3f)
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
                moveTo(7.99f, 2f)
                verticalLineTo(7f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineTo(4f)
            }
        }.build()

        return _Brush3!!
    }

@Suppress("ObjectPropertyName")
private var _Brush3: ImageVector? = null
