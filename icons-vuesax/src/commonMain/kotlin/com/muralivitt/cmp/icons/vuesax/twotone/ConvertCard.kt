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

val VuesaxIconsTwotone.ConvertCard: ImageVector
    get() {
        if (_ConvertCard != null) {
            return _ConvertCard!!
        }
        _ConvertCard = ImageVector.Builder(
            name = "ConvertCard",
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
                moveTo(12f, 5.56f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.22f, 2f)
                horizontalLineTo(19.78f)
                curveTo(21.56f, 2f, 22f, 2.44f, 22f, 4.2f)
                verticalLineTo(8.31f)
                curveTo(22f, 10.07f, 21.56f, 10.51f, 19.78f, 10.51f)
                horizontalLineTo(14.22f)
                curveTo(12.44f, 10.51f, 12f, 10.07f, 12f, 8.31f)
                verticalLineTo(4.2f)
                curveTo(12f, 2.44f, 12.44f, 2f, 14.22f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 17.06f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.22f, 13.5f)
                horizontalLineTo(9.78f)
                curveTo(11.56f, 13.5f, 12f, 13.94f, 12f, 15.7f)
                verticalLineTo(19.81f)
                curveTo(12f, 21.57f, 11.56f, 22.01f, 9.78f, 22.01f)
                horizontalLineTo(4.22f)
                curveTo(2.44f, 22.01f, 2f, 21.57f, 2f, 19.81f)
                verticalLineTo(15.7f)
                curveTo(2f, 13.94f, 2.44f, 13.5f, 4.22f, 13.5f)
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
                moveTo(22f, 15f)
                curveTo(22f, 18.87f, 18.87f, 22f, 15f, 22f)
                lineTo(16.05f, 20.25f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                curveTo(2f, 5.13f, 5.13f, 2f, 9f, 2f)
                lineTo(7.95f, 3.75f)
            }
        }.build()

        return _ConvertCard!!
    }

@Suppress("ObjectPropertyName")
private var _ConvertCard: ImageVector? = null
