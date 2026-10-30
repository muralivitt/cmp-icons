package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Translate: ImageVector
    get() {
        if (_Translate != null) {
            return _Translate!!
        }
        _Translate = ImageVector.Builder(
            name = "Translate",
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
                moveTo(19.06f, 18.67f)
                lineTo(16.92f, 14.4f)
                lineTo(14.78f, 18.67f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.17f, 17.91f)
                horizontalLineTo(18.69f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.92f, 22f)
                curveTo(14.12f, 22f, 11.84f, 19.73f, 11.84f, 16.92f)
                curveTo(11.84f, 14.12f, 14.11f, 11.84f, 16.92f, 11.84f)
                curveTo(19.72f, 11.84f, 22f, 14.11f, 22f, 16.92f)
                curveTo(22f, 19.73f, 19.73f, 22f, 16.92f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.02f, 2f)
                horizontalLineTo(8.94f)
                curveTo(11.01f, 2f, 12.01f, 3f, 11.96f, 5.02f)
                verticalLineTo(8.94f)
                curveTo(12.01f, 11.01f, 11.01f, 12.01f, 8.94f, 11.96f)
                horizontalLineTo(5.02f)
                curveTo(3f, 12f, 2f, 11f, 2f, 8.93f)
                verticalLineTo(5.01f)
                curveTo(2f, 3f, 3f, 2f, 5.02f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.01f, 5.85f)
                horizontalLineTo(4.95f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.97f, 5.17f)
                verticalLineTo(5.85f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.99f, 5.84f)
                curveTo(7.99f, 7.59f, 6.62f, 9.01f, 4.94f, 9.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.01f, 9.01f)
                curveTo(8.28f, 9.01f, 7.62f, 8.62f, 7.16f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 15f)
                curveTo(2f, 18.87f, 5.13f, 22f, 9f, 22f)
                lineTo(7.95f, 20.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 9f)
                curveTo(22f, 5.13f, 18.87f, 2f, 15f, 2f)
                lineTo(16.05f, 3.75f)
            }
        }.build()

        return _Translate!!
    }

@Suppress("ObjectPropertyName")
private var _Translate: ImageVector? = null
