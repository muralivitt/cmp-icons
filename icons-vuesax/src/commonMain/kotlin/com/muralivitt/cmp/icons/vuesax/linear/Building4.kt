package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Building4: ImageVector
    get() {
        if (_Building4 != null) {
            return _Building4!!
        }
        _Building4 = ImageVector.Builder(
            name = "Building4",
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
                moveTo(1f, 22f)
                horizontalLineTo(23f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.78f, 22.01f)
                verticalLineTo(17.55f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.8f, 10.89f)
                curveTo(18.58f, 10.89f, 17.6f, 11.87f, 17.6f, 13.09f)
                verticalLineTo(15.36f)
                curveTo(17.6f, 16.58f, 18.58f, 17.56f, 19.8f, 17.56f)
                curveTo(21.02f, 17.56f, 22f, 16.58f, 22f, 15.36f)
                verticalLineTo(13.09f)
                curveTo(22f, 11.87f, 21.02f, 10.89f, 19.8f, 10.89f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.1f, 22f)
                verticalLineTo(6.03f)
                curveTo(2.1f, 4.02f, 3.1f, 3.01f, 5.09f, 3.01f)
                horizontalLineTo(11.32f)
                curveTo(13.31f, 3.01f, 14.3f, 4.02f, 14.3f, 6.03f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.8f, 8.25f)
                horizontalLineTo(10.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.8f, 12f)
                horizontalLineTo(10.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.25f, 22f)
                verticalLineTo(18.25f)
            }
        }.build()

        return _Building4!!
    }

@Suppress("ObjectPropertyName")
private var _Building4: ImageVector? = null
