package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DocumentFilter: ImageVector
    get() {
        if (_DocumentFilter != null) {
            return _DocumentFilter!!
        }
        _DocumentFilter = ImageVector.Builder(
            name = "DocumentFilter",
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
                moveTo(3.35f, 2f)
                horizontalLineTo(12.25f)
                curveTo(12.99f, 2f, 13.6f, 2.61f, 13.6f, 3.35f)
                verticalLineTo(4.83f)
                curveTo(13.6f, 5.37f, 13.26f, 6.04f, 12.93f, 6.38f)
                lineTo(10.03f, 8.94f)
                curveTo(9.63f, 9.28f, 9.36f, 9.95f, 9.36f, 10.49f)
                verticalLineTo(13.39f)
                curveTo(9.36f, 13.79f, 9.09f, 14.33f, 8.75f, 14.54f)
                lineTo(7.81f, 15.15f)
                curveTo(6.93f, 15.69f, 5.72f, 15.08f, 5.72f, 14f)
                verticalLineTo(10.43f)
                curveTo(5.72f, 9.96f, 5.45f, 9.35f, 5.18f, 9.01f)
                lineTo(2.62f, 6.31f)
                curveTo(2.28f, 5.97f, 2.01f, 5.37f, 2.01f, 4.96f)
                verticalLineTo(3.41f)
                curveTo(2f, 2.61f, 2.61f, 2f, 3.35f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 5.88f, 21.22f, 3.92f, 19.41f, 2.9f)
                curveTo(18.9f, 2.61f, 17.88f, 2.39f, 16.95f, 2.24f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 13f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 17f)
                horizontalLineTo(18f)
            }
        }.build()

        return _DocumentFilter!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentFilter: ImageVector? = null
