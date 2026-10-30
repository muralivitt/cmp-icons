package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Autobrightness: ImageVector
    get() {
        if (_Autobrightness != null) {
            return _Autobrightness!!
        }
        _Autobrightness = ImageVector.Builder(
            name = "Autobrightness",
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
                moveTo(10.75f, 2.45f)
                curveTo(11.45f, 1.86f, 12.58f, 1.86f, 13.26f, 2.45f)
                lineTo(14.84f, 3.8f)
                curveTo(15.14f, 4.05f, 15.71f, 4.26f, 16.11f, 4.26f)
                horizontalLineTo(17.81f)
                curveTo(18.87f, 4.26f, 19.74f, 5.13f, 19.74f, 6.19f)
                verticalLineTo(7.89f)
                curveTo(19.74f, 8.29f, 19.95f, 8.85f, 20.2f, 9.15f)
                lineTo(21.55f, 10.73f)
                curveTo(22.14f, 11.43f, 22.14f, 12.56f, 21.55f, 13.24f)
                lineTo(20.2f, 14.82f)
                curveTo(19.95f, 15.12f, 19.74f, 15.68f, 19.74f, 16.08f)
                verticalLineTo(17.78f)
                curveTo(19.74f, 18.84f, 18.87f, 19.71f, 17.81f, 19.71f)
                horizontalLineTo(16.11f)
                curveTo(15.71f, 19.71f, 15.15f, 19.92f, 14.85f, 20.17f)
                lineTo(13.27f, 21.52f)
                curveTo(12.57f, 22.11f, 11.44f, 22.11f, 10.76f, 21.52f)
                lineTo(9.18f, 20.17f)
                curveTo(8.88f, 19.92f, 8.31f, 19.71f, 7.92f, 19.71f)
                horizontalLineTo(6.17f)
                curveTo(5.11f, 19.71f, 4.24f, 18.84f, 4.24f, 17.78f)
                verticalLineTo(16.07f)
                curveTo(4.24f, 15.68f, 4.04f, 15.11f, 3.79f, 14.82f)
                lineTo(2.44f, 13.23f)
                curveTo(1.86f, 12.54f, 1.86f, 11.42f, 2.44f, 10.73f)
                lineTo(3.79f, 9.14f)
                curveTo(4.04f, 8.84f, 4.24f, 8.28f, 4.24f, 7.89f)
                verticalLineTo(6.2f)
                curveTo(4.24f, 5.14f, 5.11f, 4.27f, 6.17f, 4.27f)
                horizontalLineTo(7.9f)
                curveTo(8.3f, 4.27f, 8.86f, 4.06f, 9.16f, 3.81f)
                lineTo(10.75f, 2.45f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Bevel
            ) {
                moveTo(8.5f, 15.94f)
                lineTo(12f, 8.06f)
                lineTo(15.5f, 15.94f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.75f, 13.31f)
                horizontalLineTo(10.25f)
            }
        }.build()

        return _Autobrightness!!
    }

@Suppress("ObjectPropertyName")
private var _Autobrightness: ImageVector? = null
