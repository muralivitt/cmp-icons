package com.muralivitt.cmp.icons.vuesax.other

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StudentLogo: ImageVector
    get() {
        if (_Student != null) {
            return _Student!!
        }
        _Student = ImageVector.Builder(
            name = "Student",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(226.53f, 56.41f)
                lineToRelative(-96f, -32f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.06f, 0f)
                lineTo(29.62f, 56.36f)
                lineToRelative(-0.01f, 0f)
                lineToRelative(-0.14f, 0.05f)
                curveToRelative(-0.03f, 0.01f, -0.05f, 0.02f, -0.08f, 0.03f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.01f, 0.43f)
                curveToRelative(-0.04f, 0.02f, -0.08f, 0.04f, -0.11f, 0.05f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.93f, 0.58f)
                curveToRelative(-0.07f, 0.05f, -0.13f, 0.1f, -0.19f, 0.14f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.82f, 0.71f)
                curveToRelative(-0.02f, 0.02f, -0.04f, 0.05f, -0.07f, 0.07f)
                arcToRelative(8.02f, 8.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.66f, 0.78f)
                curveToRelative(-0.04f, 0.06f, -0.08f, 0.11f, -0.12f, 0.17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.57f, 0.93f)
                curveToRelative(-0.03f, 0.05f, -0.05f, 0.1f, -0.07f, 0.15f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.41f, 0.98f)
                curveToRelative(-0.01f, 0.03f, -0.02f, 0.06f, -0.03f, 0.09f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.26f, 1.09f)
                curveToRelative(-0.01f, 0.08f, -0.02f, 0.15f, -0.04f, 0.23f)
                arcTo(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(75.1f)
                lineTo(73.59f, 86.29f)
                arcToRelative(63.97f, 63.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.43f, 87.9f)
                arcToRelative(95.88f, 95.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -46.48f, 37.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.4f, 8.74f)
                arcToRelative(80.02f, 80.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 134.13f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.4f, -8.74f)
                arcToRelative(95.88f, 95.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -46.48f, -37.44f)
                arcToRelative(63.97f, 63.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.43f, -87.9f)
                lineToRelative(44.12f, -14.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -15.18f)
                close()
                moveTo(128f, 168f)
                arcTo(47.99f, 47.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.35f, 91.55f)
                lineToRelative(36.12f, 12.04f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.06f, 0f)
                lineToRelative(36.12f, -12.04f)
                arcTo(47.99f, 47.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 168f)
                close()
            }
        }.build()

        return _Student!!
    }

@Suppress("ObjectPropertyName")
private var _Student: ImageVector? = null
