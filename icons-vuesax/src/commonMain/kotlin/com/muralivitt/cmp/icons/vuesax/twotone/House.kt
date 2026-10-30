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

val VuesaxIconsTwotone.House: ImageVector
    get() {
        if (_House != null) {
            return _House!!
        }
        _House = ImageVector.Builder(
            name = "House",
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
                moveTo(2f, 22f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.95f, 22f)
                lineTo(3f, 9.97f)
                curveTo(3f, 9.36f, 3.29f, 8.78f, 3.77f, 8.4f)
                lineTo(10.77f, 2.95f)
                curveTo(11.49f, 2.39f, 12.5f, 2.39f, 13.23f, 2.95f)
                lineTo(20.23f, 8.39f)
                curveTo(20.72f, 8.77f, 21f, 9.35f, 21f, 9.97f)
                verticalLineTo(22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 17f)
                horizontalLineTo(11f)
                curveTo(10.17f, 17f, 9.5f, 17.67f, 9.5f, 18.5f)
                verticalLineTo(22f)
                horizontalLineTo(14.5f)
                verticalLineTo(18.5f)
                curveTo(14.5f, 17.67f, 13.83f, 17f, 13f, 17f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 13.75f)
                horizontalLineTo(7.5f)
                curveTo(6.95f, 13.75f, 6.5f, 13.3f, 6.5f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(6.5f, 10.7f, 6.95f, 10.25f, 7.5f, 10.25f)
                horizontalLineTo(9.5f)
                curveTo(10.05f, 10.25f, 10.5f, 10.7f, 10.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(10.5f, 13.3f, 10.05f, 13.75f, 9.5f, 13.75f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 13.75f)
                horizontalLineTo(14.5f)
                curveTo(13.95f, 13.75f, 13.5f, 13.3f, 13.5f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(13.5f, 10.7f, 13.95f, 10.25f, 14.5f, 10.25f)
                horizontalLineTo(16.5f)
                curveTo(17.05f, 10.25f, 17.5f, 10.7f, 17.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(17.5f, 13.3f, 17.05f, 13.75f, 16.5f, 13.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 7f)
                lineTo(18.97f, 4f)
                horizontalLineTo(14.57f)
            }
        }.build()

        return _House!!
    }

@Suppress("ObjectPropertyName")
private var _House: ImageVector? = null
