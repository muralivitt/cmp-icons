package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.OmegaSquare: ImageVector
    get() {
        if (_OmegaSquare != null) {
            return _OmegaSquare!!
        }
        _OmegaSquare = ImageVector.Builder(
            name = "OmegaSquare",
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
                moveTo(22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16.75f)
                horizontalLineTo(13.9f)
                lineTo(15.52f, 14.96f)
                curveTo(16.32f, 14.07f, 16.76f, 12.94f, 16.76f, 11.78f)
                curveTo(16.76f, 10.58f, 16.26f, 9.43f, 15.37f, 8.58f)
                curveTo(14.48f, 7.73f, 13.27f, 7.25f, 12f, 7.25f)
                curveTo(10.74f, 7.25f, 9.53f, 7.73f, 8.63f, 8.58f)
                curveTo(7.74f, 9.43f, 7.24f, 10.58f, 7.24f, 11.78f)
                curveTo(7.24f, 12.95f, 7.68f, 14.08f, 8.48f, 14.96f)
                lineTo(10.1f, 16.75f)
                horizontalLineTo(7f)
            }
        }.build()

        return _OmegaSquare!!
    }

@Suppress("ObjectPropertyName")
private var _OmegaSquare: ImageVector? = null
