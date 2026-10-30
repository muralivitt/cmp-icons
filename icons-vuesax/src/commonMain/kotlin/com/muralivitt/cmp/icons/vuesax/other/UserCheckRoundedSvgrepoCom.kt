package com.muralivitt.cmp.icons.vuesax.other

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserCheckRounded: ImageVector
    get() {
        if (_UserCheckRoundedSvgrepoCom != null) {
            return _UserCheckRoundedSvgrepoCom!!
        }
        _UserCheckRoundedSvgrepoCom = ImageVector.Builder(
            name = "UserCheckRoundedSvgrepoCom",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF1C274C))) {
                moveTo(12f, 6f)
                moveToRelative(-4f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF1C274C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.5f, 22f)
                curveTo(14.85f, 22f, 14.025f, 22f, 13.513f, 21.487f)
                curveTo(13f, 20.975f, 13f, 20.15f, 13f, 18.5f)
                curveTo(13f, 16.85f, 13f, 16.025f, 13.513f, 15.513f)
                curveTo(14.025f, 15f, 14.85f, 15f, 16.5f, 15f)
                curveTo(18.15f, 15f, 18.975f, 15f, 19.487f, 15.513f)
                curveTo(20f, 16.025f, 20f, 16.85f, 20f, 18.5f)
                curveTo(20f, 20.15f, 20f, 20.975f, 19.487f, 21.487f)
                curveTo(18.975f, 22f, 18.15f, 22f, 16.5f, 22f)
                close()
                moveTo(18.468f, 17.746f)
                curveTo(18.696f, 17.518f, 18.696f, 17.149f, 18.468f, 16.921f)
                curveTo(18.24f, 16.693f, 17.871f, 16.693f, 17.643f, 16.921f)
                lineTo(15.722f, 18.842f)
                lineTo(15.357f, 18.476f)
                curveTo(15.129f, 18.249f, 14.76f, 18.249f, 14.532f, 18.476f)
                curveTo(14.304f, 18.704f, 14.304f, 19.074f, 14.532f, 19.301f)
                lineTo(15.31f, 20.079f)
                curveTo(15.538f, 20.307f, 15.907f, 20.307f, 16.135f, 20.079f)
                lineTo(18.468f, 17.746f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C))) {
                moveTo(15.415f, 13.507f)
                curveTo(14.405f, 13.184f, 13.24f, 13f, 12f, 13f)
                curveTo(8.134f, 13f, 5f, 14.791f, 5f, 17f)
                curveTo(5f, 19.141f, 7.942f, 20.888f, 11.642f, 20.995f)
                curveTo(11.615f, 20.869f, 11.594f, 20.743f, 11.578f, 20.62f)
                curveTo(11.5f, 20.042f, 11.5f, 19.337f, 11.5f, 18.586f)
                verticalLineTo(18.414f)
                curveTo(11.5f, 17.663f, 11.5f, 16.958f, 11.578f, 16.38f)
                curveTo(11.664f, 15.737f, 11.87f, 15.033f, 12.452f, 14.452f)
                curveTo(13.033f, 13.87f, 13.737f, 13.664f, 14.38f, 13.577f)
                curveTo(14.692f, 13.535f, 15.041f, 13.516f, 15.415f, 13.507f)
                close()
            }
        }.build()

        return _UserCheckRoundedSvgrepoCom!!
    }

@Suppress("ObjectPropertyName")
private var _UserCheckRoundedSvgrepoCom: ImageVector? = null
