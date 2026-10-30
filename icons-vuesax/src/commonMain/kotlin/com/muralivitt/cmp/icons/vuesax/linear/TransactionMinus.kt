package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.TransactionMinus: ImageVector
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
                moveTo(6.728f, 19.7f)
                curveTo(7.548f, 18.82f, 8.798f, 18.89f, 9.518f, 19.85f)
                lineTo(10.528f, 21.2f)
                curveTo(11.338f, 22.27f, 12.648f, 22.27f, 13.458f, 21.2f)
                lineTo(14.468f, 19.85f)
                curveTo(15.188f, 18.89f, 16.438f, 18.82f, 17.258f, 19.7f)
                curveTo(19.038f, 21.6f, 20.488f, 20.97f, 20.488f, 18.31f)
                verticalLineTo(7.04f)
                curveTo(20.488f, 3.01f, 19.548f, 2f, 15.768f, 2f)
                horizontalLineTo(8.208f)
                curveTo(4.428f, 2f, 3.488f, 3.01f, 3.488f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(3.498f, 20.97f, 4.958f, 21.59f, 6.728f, 19.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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
