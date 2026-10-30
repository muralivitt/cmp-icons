package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Verify: ImageVector
    get() {
        if (_Verify != null) {
            return _Verify!!
        }
        _Verify = ImageVector.Builder(
            name = "Verify",
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
                moveTo(8.38f, 12f)
                lineTo(10.79f, 14.42f)
                lineTo(15.62f, 9.58f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.75f, 2.45f)
                curveTo(11.44f, 1.86f, 12.57f, 1.86f, 13.27f, 2.45f)
                lineTo(14.85f, 3.81f)
                curveTo(15.15f, 4.07f, 15.71f, 4.28f, 16.11f, 4.28f)
                horizontalLineTo(17.81f)
                curveTo(18.87f, 4.28f, 19.74f, 5.15f, 19.74f, 6.21f)
                verticalLineTo(7.91f)
                curveTo(19.74f, 8.3f, 19.95f, 8.87f, 20.21f, 9.17f)
                lineTo(21.57f, 10.75f)
                curveTo(22.16f, 11.44f, 22.16f, 12.57f, 21.57f, 13.27f)
                lineTo(20.21f, 14.85f)
                curveTo(19.95f, 15.15f, 19.74f, 15.71f, 19.74f, 16.11f)
                verticalLineTo(17.81f)
                curveTo(19.74f, 18.87f, 18.87f, 19.74f, 17.81f, 19.74f)
                horizontalLineTo(16.11f)
                curveTo(15.72f, 19.74f, 15.15f, 19.95f, 14.85f, 20.21f)
                lineTo(13.27f, 21.57f)
                curveTo(12.58f, 22.16f, 11.45f, 22.16f, 10.75f, 21.57f)
                lineTo(9.17f, 20.21f)
                curveTo(8.87f, 19.95f, 8.31f, 19.74f, 7.91f, 19.74f)
                horizontalLineTo(6.18f)
                curveTo(5.12f, 19.74f, 4.25f, 18.87f, 4.25f, 17.81f)
                verticalLineTo(16.1f)
                curveTo(4.25f, 15.71f, 4.04f, 15.15f, 3.79f, 14.85f)
                lineTo(2.44f, 13.26f)
                curveTo(1.86f, 12.57f, 1.86f, 11.45f, 2.44f, 10.76f)
                lineTo(3.79f, 9.17f)
                curveTo(4.04f, 8.87f, 4.25f, 8.31f, 4.25f, 7.92f)
                verticalLineTo(6.2f)
                curveTo(4.25f, 5.14f, 5.12f, 4.27f, 6.18f, 4.27f)
                horizontalLineTo(7.91f)
                curveTo(8.3f, 4.27f, 8.87f, 4.06f, 9.17f, 3.8f)
                lineTo(10.75f, 2.45f)
                close()
            }
        }.build()

        return _Verify!!
    }

@Suppress("ObjectPropertyName")
private var _Verify: ImageVector? = null
