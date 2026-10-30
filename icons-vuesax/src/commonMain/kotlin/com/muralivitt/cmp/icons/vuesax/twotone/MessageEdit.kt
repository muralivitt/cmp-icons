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

val VuesaxIconsTwotone.MessageEdit: ImageVector
    get() {
        if (_MessageEdit != null) {
            return _MessageEdit!!
        }
        _MessageEdit = ImageVector.Builder(
            name = "MessageEdit",
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
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(4f, 2f, 2f, 4f, 2f, 8f)
                verticalLineTo(21f)
                curveTo(2f, 21.55f, 2.45f, 22f, 3f, 22f)
                horizontalLineTo(16f)
                curveTo(20f, 22f, 22f, 20f, 22f, 16f)
                verticalLineTo(8f)
                curveTo(22f, 4f, 20f, 2f, 16f, 2f)
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
                moveTo(12.909f, 7.84f)
                lineTo(7.719f, 13.03f)
                curveTo(7.519f, 13.23f, 7.329f, 13.62f, 7.289f, 13.9f)
                lineTo(7.009f, 15.88f)
                curveTo(6.909f, 16.6f, 7.409f, 17.1f, 8.129f, 17f)
                lineTo(10.109f, 16.72f)
                curveTo(10.389f, 16.68f, 10.779f, 16.49f, 10.979f, 16.29f)
                lineTo(16.169f, 11.1f)
                curveTo(17.059f, 10.21f, 17.489f, 9.17f, 16.169f, 7.85f)
                curveTo(14.849f, 6.52f, 13.809f, 6.94f, 12.909f, 7.84f)
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
                moveTo(12.168f, 8.58f)
                curveTo(12.608f, 10.15f, 13.838f, 11.39f, 15.418f, 11.83f)
            }
        }.build()

        return _MessageEdit!!
    }

@Suppress("ObjectPropertyName")
private var _MessageEdit: ImageVector? = null
