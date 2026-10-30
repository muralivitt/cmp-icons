package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BookSquare: ImageVector
    get() {
        if (_BookSquare != null) {
            return _BookSquare!!
        }
        _BookSquare = ImageVector.Builder(
            name = "BookSquare",
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
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.38f, 15.27f)
                verticalLineTo(7.58f)
                curveTo(18.38f, 6.81f, 17.76f, 6.25f, 17f, 6.31f)
                horizontalLineTo(16.96f)
                curveTo(15.62f, 6.42f, 13.59f, 7.11f, 12.45f, 7.82f)
                lineTo(12.34f, 7.89f)
                curveTo(12.16f, 8f, 11.85f, 8f, 11.66f, 7.89f)
                lineTo(11.5f, 7.79f)
                curveTo(10.37f, 7.08f, 8.34f, 6.41f, 7f, 6.3f)
                curveTo(6.24f, 6.24f, 5.62f, 6.81f, 5.62f, 7.57f)
                verticalLineTo(15.27f)
                curveTo(5.62f, 15.88f, 6.12f, 16.46f, 6.73f, 16.53f)
                lineTo(6.91f, 16.56f)
                curveTo(8.29f, 16.74f, 10.43f, 17.45f, 11.65f, 18.12f)
                lineTo(11.68f, 18.13f)
                curveTo(11.85f, 18.23f, 12.13f, 18.23f, 12.29f, 18.13f)
                curveTo(13.51f, 17.45f, 15.66f, 16.75f, 17.05f, 16.56f)
                lineTo(17.26f, 16.53f)
                curveTo(17.88f, 16.46f, 18.38f, 15.89f, 18.38f, 15.27f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8.1f)
                verticalLineTo(17.66f)
            }
        }.build()

        return _BookSquare!!
    }

@Suppress("ObjectPropertyName")
private var _BookSquare: ImageVector? = null
