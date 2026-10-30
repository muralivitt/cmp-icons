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

val VuesaxIconsTwotone.DocumentLike: ImageVector
    get() {
        if (_DocumentLike != null) {
            return _DocumentLike!!
        }
        _DocumentLike = ImageVector.Builder(
            name = "DocumentLike",
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
                moveTo(21f, 7f)
                verticalLineTo(17f)
                curveTo(21f, 20f, 19.5f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(4.5f, 22f, 3f, 20f, 3f, 17f)
                verticalLineTo(7f)
                curveTo(3f, 4f, 4.5f, 2f, 8f, 2f)
                horizontalLineTo(16f)
                curveTo(19.5f, 2f, 21f, 4f, 21f, 7f)
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
                moveTo(14.5f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(14.5f, 7.6f, 15.4f, 8.5f, 16.5f, 8.5f)
                horizontalLineTo(18.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.479f, 15.49f)
                curveTo(7.149f, 14.46f, 7.539f, 13.19f, 8.609f, 12.84f)
                curveTo(9.179f, 12.66f, 9.879f, 12.81f, 10.269f, 13.36f)
                curveTo(10.639f, 12.79f, 11.369f, 12.66f, 11.929f, 12.84f)
                curveTo(13.009f, 13.19f, 13.389f, 14.46f, 13.069f, 15.49f)
                curveTo(12.559f, 17.12f, 10.769f, 17.97f, 10.269f, 17.97f)
                curveTo(9.779f, 17.96f, 8.009f, 17.13f, 7.479f, 15.49f)
                close()
            }
        }.build()

        return _DocumentLike!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentLike: ImageVector? = null
