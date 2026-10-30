package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BrifecaseTick: ImageVector
    get() {
        if (_BrifecaseTick != null) {
            return _BrifecaseTick!!
        }
        _BrifecaseTick = ImageVector.Builder(
            name = "BrifecaseTick",
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
                moveTo(12f, 18.2f)
                curveTo(14.209f, 18.2f, 16f, 16.409f, 16f, 14.2f)
                curveTo(16f, 11.991f, 14.209f, 10.2f, 12f, 10.2f)
                curveTo(9.791f, 10.2f, 8f, 11.991f, 8f, 14.2f)
                curveTo(8f, 16.409f, 9.791f, 18.2f, 12f, 18.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.44f, 14.3f)
                lineTo(11.09f, 14.95f)
                curveTo(11.28f, 15.14f, 11.59f, 15.14f, 11.78f, 14.96f)
                lineTo(13.56f, 13.32f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 22f)
                horizontalLineTo(16f)
                curveTo(20.02f, 22f, 20.74f, 20.39f, 20.95f, 18.43f)
                lineTo(21.7f, 10.43f)
                curveTo(21.97f, 7.99f, 21.27f, 6f, 17f, 6f)
                horizontalLineTo(7f)
                curveTo(2.73f, 6f, 2.03f, 7.99f, 2.3f, 10.43f)
                lineTo(3.05f, 18.43f)
                curveTo(3.26f, 20.39f, 3.98f, 22f, 8f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 6f)
                verticalLineTo(5.2f)
                curveTo(8f, 3.43f, 8f, 2f, 11.2f, 2f)
                horizontalLineTo(12.8f)
                curveTo(16f, 2f, 16f, 3.43f, 16f, 5.2f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.65f, 11f)
                curveTo(19.92f, 12.26f, 18f, 13.14f, 16.01f, 13.64f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.62f, 11.27f)
                curveTo(4.29f, 12.41f, 6.11f, 13.22f, 8f, 13.68f)
            }
        }.build()

        return _BrifecaseTick!!
    }

@Suppress("ObjectPropertyName")
private var _BrifecaseTick: ImageVector? = null
