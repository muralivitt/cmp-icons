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

val VuesaxIconsTwotone.TransactionMinus: ImageVector
    get() {
        if (_TransactionMinus != null) {
            return _TransactionMinus!!
        }
        _TransactionMinus = ImageVector.Builder(
            name = "TransactionMinus",
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
                moveTo(6.73f, 19.7f)
                curveTo(7.55f, 18.82f, 8.8f, 18.89f, 9.52f, 19.85f)
                lineTo(10.53f, 21.2f)
                curveTo(11.34f, 22.27f, 12.65f, 22.27f, 13.46f, 21.2f)
                lineTo(14.47f, 19.85f)
                curveTo(15.19f, 18.89f, 16.44f, 18.82f, 17.26f, 19.7f)
                curveTo(19.04f, 21.6f, 20.49f, 20.97f, 20.49f, 18.31f)
                verticalLineTo(7.04f)
                curveTo(20.49f, 3.01f, 19.55f, 2f, 15.77f, 2f)
                horizontalLineTo(8.21f)
                curveTo(4.43f, 2f, 3.49f, 3.01f, 3.49f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(3.5f, 20.97f, 4.96f, 21.59f, 6.73f, 19.7f)
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
                moveTo(9.25f, 10f)
                horizontalLineTo(14.75f)
            }
        }.build()

        return _TransactionMinus!!
    }

@Suppress("ObjectPropertyName")
private var _TransactionMinus: ImageVector? = null
