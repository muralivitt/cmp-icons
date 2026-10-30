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

val VuesaxIconsTwotone.Gift: ImageVector
    get() {
        if (_Gift != null) {
            return _Gift!!
        }
        _Gift = ImageVector.Builder(
            name = "Gift",
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
                moveTo(19.971f, 10f)
                horizontalLineTo(3.971f)
                verticalLineTo(18f)
                curveTo(3.971f, 21f, 4.971f, 22f, 7.971f, 22f)
                horizontalLineTo(15.971f)
                curveTo(18.971f, 22f, 19.971f, 21f, 19.971f, 18f)
                verticalLineTo(10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.5f, 7f)
                verticalLineTo(8f)
                curveTo(21.5f, 9.1f, 20.97f, 10f, 19.5f, 10f)
                horizontalLineTo(4.5f)
                curveTo(2.97f, 10f, 2.5f, 9.1f, 2.5f, 8f)
                verticalLineTo(7f)
                curveTo(2.5f, 5.9f, 2.97f, 5f, 4.5f, 5f)
                horizontalLineTo(19.5f)
                curveTo(20.97f, 5f, 21.5f, 5.9f, 21.5f, 7f)
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
                moveTo(11.641f, 5f)
                horizontalLineTo(6.121f)
                curveTo(5.781f, 4.63f, 5.791f, 4.06f, 6.151f, 3.7f)
                lineTo(7.571f, 2.28f)
                curveTo(7.941f, 1.91f, 8.551f, 1.91f, 8.921f, 2.28f)
                lineTo(11.641f, 5f)
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
                moveTo(17.87f, 5f)
                horizontalLineTo(12.35f)
                lineTo(15.07f, 2.28f)
                curveTo(15.44f, 1.91f, 16.05f, 1.91f, 16.42f, 2.28f)
                lineTo(17.84f, 3.7f)
                curveTo(18.2f, 4.06f, 18.21f, 4.63f, 17.87f, 5f)
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
                moveTo(8.939f, 10f)
                verticalLineTo(15.14f)
                curveTo(8.939f, 15.94f, 9.819f, 16.41f, 10.49f, 15.98f)
                lineTo(11.429f, 15.36f)
                curveTo(11.769f, 15.14f, 12.2f, 15.14f, 12.53f, 15.36f)
                lineTo(13.42f, 15.96f)
                curveTo(14.08f, 16.4f, 14.969f, 15.93f, 14.969f, 15.13f)
                verticalLineTo(10f)
                horizontalLineTo(8.939f)
                close()
            }
        }.build()

        return _Gift!!
    }

@Suppress("ObjectPropertyName")
private var _Gift: ImageVector? = null
