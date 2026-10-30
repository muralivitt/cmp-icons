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

val VuesaxIconsTwotone.TagUser: ImageVector
    get() {
        if (_TagUser != null) {
            return _TagUser!!
        }
        _TagUser = ImageVector.Builder(
            name = "TagUser",
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
                moveTo(18f, 18.86f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.86f, 15.68f, 19.17f, 15.12f, 19.73f)
                lineTo(13.41f, 21.42f)
                curveTo(12.63f, 22.19f, 11.36f, 22.19f, 10.58f, 21.42f)
                lineTo(8.87f, 19.73f)
                curveTo(8.31f, 19.17f, 7.54f, 18.86f, 6.75f, 18.86f)
                horizontalLineTo(6f)
                curveTo(4.34f, 18.86f, 3f, 17.53f, 3f, 15.89f)
                verticalLineTo(4.97f)
                curveTo(3f, 3.33f, 4.34f, 2f, 6f, 2f)
                horizontalLineTo(18f)
                curveTo(19.66f, 2f, 21f, 3.33f, 21f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(21f, 17.52f, 19.66f, 18.86f, 18f, 18.86f)
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
                moveTo(12.069f, 8.95f)
                curveTo(12.029f, 8.95f, 11.969f, 8.95f, 11.919f, 8.95f)
                curveTo(10.869f, 8.91f, 10.039f, 8.06f, 10.039f, 7f)
                curveTo(10.039f, 5.92f, 10.909f, 5.05f, 11.989f, 5.05f)
                curveTo(13.069f, 5.05f, 13.939f, 5.93f, 13.939f, 7f)
                curveTo(13.949f, 8.06f, 13.119f, 8.92f, 12.069f, 8.95f)
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
                moveTo(9.249f, 11.96f)
                curveTo(7.919f, 12.85f, 7.919f, 14.3f, 9.249f, 15.19f)
                curveTo(10.759f, 16.2f, 13.24f, 16.2f, 14.75f, 15.19f)
                curveTo(16.08f, 14.3f, 16.08f, 12.85f, 14.75f, 11.96f)
                curveTo(13.24f, 10.96f, 10.769f, 10.96f, 9.249f, 11.96f)
                close()
            }
        }.build()

        return _TagUser!!
    }

@Suppress("ObjectPropertyName")
private var _TagUser: ImageVector? = null
