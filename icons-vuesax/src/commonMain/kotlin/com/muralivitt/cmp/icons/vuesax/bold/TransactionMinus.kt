package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.TransactionMinus: ImageVector
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
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.78f, 2f)
                horizontalLineTo(8.22f)
                curveTo(4.44f, 2f, 3.5f, 3.01f, 3.5f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(3.5f, 20.96f, 4.96f, 21.59f, 6.73f, 19.69f)
                lineTo(6.74f, 19.68f)
                curveTo(7.56f, 18.81f, 8.81f, 18.88f, 9.52f, 19.83f)
                lineTo(10.53f, 21.18f)
                curveTo(11.34f, 22.25f, 12.65f, 22.25f, 13.46f, 21.18f)
                lineTo(14.47f, 19.83f)
                curveTo(15.19f, 18.87f, 16.44f, 18.8f, 17.26f, 19.68f)
                curveTo(19.04f, 21.58f, 20.49f, 20.95f, 20.49f, 18.29f)
                verticalLineTo(7.04f)
                curveTo(20.5f, 3.01f, 19.56f, 2f, 15.78f, 2f)
                close()
                moveTo(14.75f, 10.75f)
                horizontalLineTo(9.25f)
                curveTo(8.84f, 10.75f, 8.5f, 10.41f, 8.5f, 10f)
                curveTo(8.5f, 9.59f, 8.84f, 9.25f, 9.25f, 9.25f)
                horizontalLineTo(14.75f)
                curveTo(15.16f, 9.25f, 15.5f, 9.59f, 15.5f, 10f)
                curveTo(15.5f, 10.41f, 15.16f, 10.75f, 14.75f, 10.75f)
                close()
            }
        }.build()

        return _TransactionMinus!!
    }

@Suppress("ObjectPropertyName")
private var _TransactionMinus: ImageVector? = null
