package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.HierarchySquare: ImageVector
    get() {
        if (_HierarchySquare != null) {
            return _HierarchySquare!!
        }
        _HierarchySquare = ImageVector.Builder(
            name = "HierarchySquare",
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
                moveTo(16.45f, 14.4f)
                verticalLineTo(8.5f)
                curveTo(16.45f, 7.95f, 16f, 7.5f, 15.45f, 7.5f)
                horizontalLineTo(12.55f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.05f, 6f)
                lineTo(12.25f, 7.5f)
                lineTo(14.05f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.55f, 10.2f)
                verticalLineTo(14.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.7f, 9.9f)
                curveTo(8.777f, 9.9f, 9.65f, 9.027f, 9.65f, 7.95f)
                curveTo(9.65f, 6.873f, 8.777f, 6f, 7.7f, 6f)
                curveTo(6.623f, 6f, 5.75f, 6.873f, 5.75f, 7.95f)
                curveTo(5.75f, 9.027f, 6.623f, 9.9f, 7.7f, 9.9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.55f, 18f)
                curveTo(8.544f, 18f, 9.35f, 17.194f, 9.35f, 16.2f)
                curveTo(9.35f, 15.206f, 8.544f, 14.4f, 7.55f, 14.4f)
                curveTo(6.556f, 14.4f, 5.75f, 15.206f, 5.75f, 16.2f)
                curveTo(5.75f, 17.194f, 6.556f, 18f, 7.55f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.45f, 18f)
                curveTo(17.444f, 18f, 18.25f, 17.194f, 18.25f, 16.2f)
                curveTo(18.25f, 15.206f, 17.444f, 14.4f, 16.45f, 14.4f)
                curveTo(15.456f, 14.4f, 14.65f, 15.206f, 14.65f, 16.2f)
                curveTo(14.65f, 17.194f, 15.456f, 18f, 16.45f, 18f)
                close()
            }
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
        }.build()

        return _HierarchySquare!!
    }

@Suppress("ObjectPropertyName")
private var _HierarchySquare: ImageVector? = null
