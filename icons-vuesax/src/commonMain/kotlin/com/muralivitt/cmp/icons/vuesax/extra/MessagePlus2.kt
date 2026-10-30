package com.muralivitt.cmp.icons.vuesax.extra

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VuesaxExtra.MessagePlus2: ImageVector
    get() {
        if (_AddBubbleChatCommentMessagePlusSvgrepoCom != null) {
            return _AddBubbleChatCommentMessagePlusSvgrepoCom!!
        }
        _AddBubbleChatCommentMessagePlusSvgrepoCom = ImageVector.Builder(
            name = "AddBubbleChatCommentMessagePlusSvgrepoCom",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 60f,
            viewportHeight = 60f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF699F4C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(47.875f, 35.969f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47.875f, 35.969f)
                close()
                moveTo(42f, 49.969f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 42f, 49.969f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA5C594)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(58.109f, 33.076f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 30f, 47.969f)
                curveToRelative(0f, 0.388f, 0.034f, 0.768f, 0.058f, 1.151f)
                lineToRelative(-0.058f, 0f)
                curveToRelative(-1.16f, 0f, -4.375f, -0.536f, -5.358f, -0.166f)
                arcToRelative(5.046f, 5.046f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.847f, 0.546f)
                curveToRelative(-0.912f, 0.91f, -8.24f, 10.53f, -13.295f, 10.49f)
                curveToRelative(-0.31f, 0f, -2.485f, 0.251f, -2.5f, -2f)
                curveToRelative(0.006f, -1.352f, 1.122f, -1.8f, 2.433f, -6.909f)
                arcToRelative(20.624f, 20.624f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.532f, -6.341f)
                arcToRelative(2.958f, 2.958f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.059f, -1.948f)
                curveToRelative(-6.082f, -4.495f, -9.906f, -11f, -9.906f, -18.236f)
                curveToRelative(0f, -13.568f, 13.431f, -24.566f, 30f, -24.566f)
                reflectiveCurveToRelative(30f, 11f, 30f, 24.566f)
                arcTo(20.571f, 20.571f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.109f, 33.076f)
                close()
            }
        }.build()

        return _AddBubbleChatCommentMessagePlusSvgrepoCom!!
    }

@Suppress("ObjectPropertyName")
private var _AddBubbleChatCommentMessagePlusSvgrepoCom: ImageVector? = null
