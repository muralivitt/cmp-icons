package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.HierarchySquare3: ImageVector
    get() {
        if (_HierarchySquare3 != null) {
            return _HierarchySquare3!!
        }
        _HierarchySquare3 = ImageVector.Builder(
            name = "HierarchySquare3",
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
                moveTo(7.8f, 13.8f)
                verticalLineTo(9.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.95f, 18f)
                curveTo(9.027f, 18f, 9.9f, 17.127f, 9.9f, 16.05f)
                curveTo(9.9f, 14.973f, 9.027f, 14.1f, 7.95f, 14.1f)
                curveTo(6.873f, 14.1f, 6f, 14.973f, 6f, 16.05f)
                curveTo(6f, 17.127f, 6.873f, 18f, 7.95f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.8f, 9.6f)
                curveTo(8.794f, 9.6f, 9.6f, 8.794f, 9.6f, 7.8f)
                curveTo(9.6f, 6.806f, 8.794f, 6f, 7.8f, 6f)
                curveTo(6.806f, 6f, 6f, 6.806f, 6f, 7.8f)
                curveTo(6f, 8.794f, 6.806f, 9.6f, 7.8f, 9.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.2f, 9.6f)
                curveTo(17.194f, 9.6f, 18f, 8.794f, 18f, 7.8f)
                curveTo(18f, 6.806f, 17.194f, 6f, 16.2f, 6f)
                curveTo(15.206f, 6f, 14.4f, 6.806f, 14.4f, 7.8f)
                curveTo(14.4f, 8.794f, 15.206f, 9.6f, 16.2f, 9.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.88f, 13.8f)
                curveTo(8.15f, 12.75f, 9.11f, 11.97f, 10.24f, 11.98f)
                lineTo(12.3f, 11.99f)
                curveTo(13.87f, 12f, 15.21f, 10.99f, 15.7f, 9.58f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 2f)
                horizontalLineTo(15f)
                curveTo(20f, 2f, 22f, 4f, 22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 20f, 20f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(4f, 22f, 2f, 20f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 4f, 4f, 2f, 9f, 2f)
                close()
            }
        }.build()

        return _HierarchySquare3!!
    }

@Suppress("ObjectPropertyName")
private var _HierarchySquare3: ImageVector? = null
