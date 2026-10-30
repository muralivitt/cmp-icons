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

val VuesaxIconsTwotone.CardEdit: ImageVector
    get() {
        if (_CardEdit != null) {
            return _CardEdit!!
        }
        _CardEdit = ImageVector.Builder(
            name = "CardEdit",
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
                moveTo(1.996f, 8.5f)
                horizontalLineTo(11.496f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.996f, 16.5f)
                horizontalLineTo(7.996f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.496f, 16.5f)
                horizontalLineTo(14.496f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.996f, 12.03f)
                verticalLineTo(16.11f)
                curveTo(21.996f, 19.62f, 21.106f, 20.5f, 17.556f, 20.5f)
                horizontalLineTo(6.436f)
                curveTo(2.886f, 20.5f, 1.996f, 19.62f, 1.996f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(1.996f, 4.38f, 2.886f, 3.5f, 6.436f, 3.5f)
                horizontalLineTo(14.496f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.076f, 4.13f)
                lineTo(15.366f, 7.84f)
                curveTo(15.226f, 7.98f, 15.086f, 8.26f, 15.056f, 8.46f)
                lineTo(14.856f, 9.88f)
                curveTo(14.786f, 10.39f, 15.146f, 10.75f, 15.656f, 10.68f)
                lineTo(17.076f, 10.48f)
                curveTo(17.276f, 10.45f, 17.556f, 10.31f, 17.696f, 10.17f)
                lineTo(21.406f, 6.46f)
                curveTo(22.046f, 5.82f, 22.346f, 5.08f, 21.406f, 4.14f)
                curveTo(20.456f, 3.19f, 19.716f, 3.49f, 19.076f, 4.13f)
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
                moveTo(18.547f, 4.66f)
                curveTo(18.867f, 5.79f, 19.747f, 6.67f, 20.867f, 6.98f)
            }
        }.build()

        return _CardEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CardEdit: ImageVector? = null
