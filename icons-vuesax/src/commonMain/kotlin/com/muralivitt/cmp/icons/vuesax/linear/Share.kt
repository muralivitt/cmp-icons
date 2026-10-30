package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Share: ImageVector
    get() {
        if (_Share != null) {
            return _Share!!
        }
        _Share = ImageVector.Builder(
            name = "Share",
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
                moveTo(16.96f, 6.17f)
                curveTo(18.96f, 7.56f, 20.34f, 9.77f, 20.62f, 12.32f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.49f, 12.37f)
                curveTo(3.75f, 9.83f, 5.11f, 7.62f, 7.09f, 6.22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.19f, 20.94f)
                curveTo(9.35f, 21.53f, 10.67f, 21.86f, 12.06f, 21.86f)
                curveTo(13.4f, 21.86f, 14.66f, 21.56f, 15.79f, 21.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.06f, 7.7f)
                curveTo(13.595f, 7.7f, 14.84f, 6.455f, 14.84f, 4.92f)
                curveTo(14.84f, 3.385f, 13.595f, 2.14f, 12.06f, 2.14f)
                curveTo(10.525f, 2.14f, 9.28f, 3.385f, 9.28f, 4.92f)
                curveTo(9.28f, 6.455f, 10.525f, 7.7f, 12.06f, 7.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.83f, 19.92f)
                curveTo(6.365f, 19.92f, 7.61f, 18.675f, 7.61f, 17.14f)
                curveTo(7.61f, 15.605f, 6.365f, 14.36f, 4.83f, 14.36f)
                curveTo(3.295f, 14.36f, 2.05f, 15.605f, 2.05f, 17.14f)
                curveTo(2.05f, 18.675f, 3.295f, 19.92f, 4.83f, 19.92f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.17f, 19.92f)
                curveTo(20.705f, 19.92f, 21.95f, 18.675f, 21.95f, 17.14f)
                curveTo(21.95f, 15.605f, 20.705f, 14.36f, 19.17f, 14.36f)
                curveTo(17.635f, 14.36f, 16.39f, 15.605f, 16.39f, 17.14f)
                curveTo(16.39f, 18.675f, 17.635f, 19.92f, 19.17f, 19.92f)
                close()
            }
        }.build()

        return _Share!!
    }

@Suppress("ObjectPropertyName")
private var _Share: ImageVector? = null
