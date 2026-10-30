package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BookSaved: ImageVector
    get() {
        if (_BookSaved != null) {
            return _BookSaved!!
        }
        _BookSaved = ImageVector.Builder(
            name = "BookSaved",
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
                moveTo(22f, 4.67f)
                verticalLineTo(16.74f)
                curveTo(22f, 17.7f, 21.22f, 18.6f, 20.26f, 18.72f)
                lineTo(19.93f, 18.76f)
                curveTo(17.75f, 19.05f, 14.39f, 20.16f, 12.47f, 21.22f)
                curveTo(12.21f, 21.37f, 11.78f, 21.37f, 11.51f, 21.22f)
                lineTo(11.47f, 21.2f)
                curveTo(9.55f, 20.15f, 6.2f, 19.05f, 4.03f, 18.76f)
                lineTo(3.74f, 18.72f)
                curveTo(2.78f, 18.6f, 2f, 17.7f, 2f, 16.74f)
                verticalLineTo(4.66f)
                curveTo(2f, 3.47f, 2.97f, 2.57f, 4.16f, 2.67f)
                curveTo(6.26f, 2.84f, 9.44f, 3.9f, 11.22f, 5.01f)
                lineTo(11.47f, 5.16f)
                curveTo(11.76f, 5.34f, 12.24f, 5.34f, 12.53f, 5.16f)
                lineTo(12.7f, 5.05f)
                curveTo(13.33f, 4.66f, 14.13f, 4.27f, 15f, 3.92f)
                verticalLineTo(8f)
                lineTo(17f, 6.67f)
                lineTo(19f, 8f)
                verticalLineTo(2.78f)
                curveTo(19.27f, 2.73f, 19.53f, 2.7f, 19.77f, 2.68f)
                horizontalLineTo(19.83f)
                curveTo(21.02f, 2.58f, 22f, 3.47f, 22f, 4.67f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5.49f)
                verticalLineTo(20.49f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 2.78f)
                verticalLineTo(8f)
                lineTo(17f, 6.67f)
                lineTo(15f, 8f)
                verticalLineTo(3.92f)
                curveTo(16.31f, 3.4f, 17.77f, 2.98f, 19f, 2.78f)
                close()
            }
        }.build()

        return _BookSaved!!
    }

@Suppress("ObjectPropertyName")
private var _BookSaved: ImageVector? = null
