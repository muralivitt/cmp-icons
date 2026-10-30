package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VuesaxIconsOutline.GroupPresentation: ImageVector
    get() {
        if (_GroupPresentation != null) {
            return _GroupPresentation!!
        }
        _GroupPresentation = ImageVector.Builder(
            name = "GroupPresentation",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 32f,
            viewportHeight = 32f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 30f)
                horizontalLineTo(8f)
                verticalLineTo(27f)
                horizontalLineTo(4f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                verticalLineTo(27f)
                arcToRelative(2.002f, 2.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineTo(8f)
                arcToRelative(2.002f, 2.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(30f, 30f)
                horizontalLineTo(28f)
                verticalLineTo(27f)
                horizontalLineTo(24f)
                verticalLineToRelative(3f)
                horizontalLineTo(22f)
                verticalLineTo(27f)
                arcToRelative(2.002f, 2.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2.002f, 2.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 30f)
                horizontalLineTo(18f)
                verticalLineTo(27f)
                horizontalLineTo(14f)
                verticalLineToRelative(3f)
                horizontalLineTo(12f)
                verticalLineTo(27f)
                arcToRelative(2.002f, 2.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2.002f, 2.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 22f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 22f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(26f, 22f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 18f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 18f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(26f, 14f)
                horizontalLineTo(6f)
                arcToRelative(2.002f, 2.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineTo(4f)
                arcTo(2.002f, 2.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                horizontalLineTo(26f)
                arcToRelative(2.002f, 2.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(8f)
                arcTo(2.002f, 2.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, 14f)
                close()
                moveTo(6f, 4f)
                verticalLineToRelative(8f)
                horizontalLineTo(26f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _GroupPresentation!!
    }

@Suppress("ObjectPropertyName")
private var _GroupPresentation: ImageVector? = null
