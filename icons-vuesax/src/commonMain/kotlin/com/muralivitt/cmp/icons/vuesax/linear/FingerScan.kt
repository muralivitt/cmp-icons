package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.FingerScan: ImageVector
    get() {
        if (_FingerScan != null) {
            return _FingerScan!!
        }
        _FingerScan = ImageVector.Builder(
            name = "FingerScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(12f, 14.88f)
                curveTo(11.09f, 14.88f, 10.35f, 14.14f, 10.35f, 13.23f)
                verticalLineTo(10.76f)
                curveTo(10.35f, 9.85f, 11.09f, 9.11f, 12f, 9.11f)
                curveTo(12.91f, 9.11f, 13.65f, 9.85f, 13.65f, 10.76f)
                verticalLineTo(13.23f)
                curveTo(13.65f, 14.14f, 12.91f, 14.88f, 12f, 14.88f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(16.98f, 13.47f)
                curveTo(16.78f, 16.05f, 14.62f, 18.07f, 12f, 18.07f)
                curveTo(9.24f, 18.07f, 7f, 15.83f, 7f, 13.07f)
                verticalLineTo(10.93f)
                curveTo(7f, 8.17f, 9.24f, 5.93f, 12f, 5.93f)
                curveTo(14.59f, 5.93f, 16.72f, 7.9f, 16.97f, 10.42f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(17f)
                curveTo(20f, 2f, 22f, 4f, 22f, 7f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                verticalLineTo(7f)
                curveTo(2f, 4f, 4f, 2f, 7f, 2f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                curveTo(20f, 22f, 22f, 20f, 22f, 17f)
                verticalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 15f)
                verticalLineTo(17f)
                curveTo(2f, 20f, 4f, 22f, 7f, 22f)
                horizontalLineTo(9f)
            }
        }.build()

        return _FingerScan!!
    }

@Suppress("ObjectPropertyName")
private var _FingerScan: ImageVector? = null
