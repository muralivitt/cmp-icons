package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.FilterEdit: ImageVector
    get() {
        if (_FilterEdit != null) {
            return _FilterEdit!!
        }
        _FilterEdit = ImageVector.Builder(
            name = "FilterEdit",
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
                moveTo(13.41f, 20.79f)
                lineTo(12f, 21.7f)
                curveTo(10.69f, 22.51f, 8.87f, 21.6f, 8.87f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.87f, 13.92f, 8.47f, 13.01f, 8.06f, 12.51f)
                lineTo(4.22f, 8.47f)
                curveTo(3.71f, 7.96f, 3.31f, 7.06f, 3.31f, 6.45f)
                verticalLineTo(4.13f)
                curveTo(3.31f, 2.92f, 4.22f, 2.01f, 5.33f, 2.01f)
                horizontalLineTo(18.67f)
                curveTo(19.78f, 2.01f, 20.69f, 2.92f, 20.69f, 4.03f)
                verticalLineTo(6.25f)
                curveTo(20.69f, 7.06f, 20.18f, 8.07f, 19.68f, 8.57f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.08f, 11.89f)
                lineTo(13.54f, 15.43f)
                curveTo(13.4f, 15.57f, 13.27f, 15.83f, 13.24f, 16.02f)
                lineTo(13.05f, 17.37f)
                curveTo(12.98f, 17.86f, 13.32f, 18.2f, 13.81f, 18.13f)
                lineTo(15.16f, 17.94f)
                curveTo(15.35f, 17.91f, 15.62f, 17.78f, 15.75f, 17.64f)
                lineTo(19.29f, 14.1f)
                curveTo(19.9f, 13.49f, 20.19f, 12.78f, 19.29f, 11.88f)
                curveTo(18.4f, 10.99f, 17.69f, 11.28f, 17.08f, 11.89f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.58f, 12.39f)
                curveTo(16.88f, 13.47f, 17.72f, 14.31f, 18.8f, 14.61f)
            }
        }.build()

        return _FilterEdit!!
    }

@Suppress("ObjectPropertyName")
private var _FilterEdit: ImageVector? = null
