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

val VuesaxIconsTwotone.SecurityCard: ImageVector
    get() {
        if (_SecurityCard != null) {
            return _SecurityCard!!
        }
        _SecurityCard = ImageVector.Builder(
            name = "SecurityCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.74f, 17.75f)
                horizontalLineTo(17.66f)
                curveTo(17.57f, 17.83f, 17.48f, 17.9f, 17.39f, 17.98f)
                lineTo(13.12f, 21.18f)
                curveTo(11.71f, 22.23f, 9.41f, 22.23f, 7.99f, 21.18f)
                lineTo(3.71f, 17.98f)
                curveTo(2.77f, 17.28f, 2f, 15.73f, 2f, 14.56f)
                verticalLineTo(7.15f)
                curveTo(2f, 5.93f, 2.93f, 4.58f, 4.07f, 4.15f)
                lineTo(9.05f, 2.28f)
                curveTo(9.87f, 1.97f, 11.23f, 1.97f, 12.05f, 2.28f)
                lineTo(17.02f, 4.15f)
                curveTo(17.97f, 4.51f, 18.78f, 5.51f, 19.03f, 6.53f)
                horizontalLineTo(11.73f)
                curveTo(11.51f, 6.53f, 11.31f, 6.54f, 11.12f, 6.54f)
                curveTo(9.27f, 6.65f, 8.79f, 7.32f, 8.79f, 9.43f)
                verticalLineTo(14.86f)
                curveTo(8.8f, 17.16f, 9.39f, 17.75f, 11.74f, 17.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.801f, 11.22f)
                horizontalLineTo(22.001f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22.001f, 9.42f)
                verticalLineTo(14.97f)
                curveTo(21.981f, 17.19f, 21.371f, 17.74f, 19.061f, 17.74f)
                horizontalLineTo(11.741f)
                curveTo(9.391f, 17.74f, 8.801f, 17.15f, 8.801f, 14.84f)
                verticalLineTo(9.41f)
                curveTo(8.801f, 7.31f, 9.281f, 6.64f, 11.131f, 6.52f)
                curveTo(11.321f, 6.52f, 11.521f, 6.51f, 11.741f, 6.51f)
                horizontalLineTo(19.061f)
                curveTo(21.411f, 6.52f, 22.001f, 7.1f, 22.001f, 9.42f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.32f, 15.26f)
                horizontalLineTo(12.65f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.75f, 15.26f)
                horizontalLineTo(18.02f)
            }
        }.build()

        return _SecurityCard!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityCard: ImageVector? = null
