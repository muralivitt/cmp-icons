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

val VuesaxIconsTwotone.HomeHashtag: ImageVector
    get() {
        if (_HomeHashtag != null) {
            return _HomeHashtag!!
        }
        _HomeHashtag = ImageVector.Builder(
            name = "HomeHashtag",
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
                moveTo(9.02f, 2.84f)
                lineTo(3.63f, 7.04f)
                curveTo(2.73f, 7.74f, 2f, 9.23f, 2f, 10.36f)
                verticalLineTo(17.77f)
                curveTo(2f, 20.09f, 3.89f, 21.99f, 6.21f, 21.99f)
                horizontalLineTo(17.79f)
                curveTo(20.11f, 21.99f, 22f, 20.09f, 22f, 17.78f)
                verticalLineTo(10.5f)
                curveTo(22f, 9.29f, 21.19f, 7.74f, 20.2f, 7.05f)
                lineTo(14.02f, 2.72f)
                curveTo(12.62f, 1.74f, 10.37f, 1.79f, 9.02f, 2.84f)
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
                moveTo(10.5f, 18f)
                horizontalLineTo(13.5f)
                curveTo(15.15f, 18f, 16.5f, 16.65f, 16.5f, 15f)
                verticalLineTo(12f)
                curveTo(16.5f, 10.35f, 15.15f, 9f, 13.5f, 9f)
                horizontalLineTo(10.5f)
                curveTo(8.85f, 9f, 7.5f, 10.35f, 7.5f, 12f)
                verticalLineTo(15f)
                curveTo(7.5f, 16.65f, 8.85f, 18f, 10.5f, 18f)
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
                moveTo(12f, 9f)
                verticalLineTo(18f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 13.5f)
                horizontalLineTo(16.5f)
            }
        }.build()

        return _HomeHashtag!!
    }

@Suppress("ObjectPropertyName")
private var _HomeHashtag: ImageVector? = null
