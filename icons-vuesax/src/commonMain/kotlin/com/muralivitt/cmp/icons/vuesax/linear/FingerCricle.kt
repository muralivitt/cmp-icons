package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.FingerCricle: ImageVector
    get() {
        if (_FingerCricle != null) {
            return _FingerCricle!!
        }
        _FingerCricle = ImageVector.Builder(
            name = "FingerCricle",
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
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
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
        }.build()

        return _FingerCricle!!
    }

@Suppress("ObjectPropertyName")
private var _FingerCricle: ImageVector? = null
