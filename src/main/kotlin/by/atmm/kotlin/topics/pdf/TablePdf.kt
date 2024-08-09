package by.atmm.kotlin.topics.pdf



object TablePdf {
//    private const val FILE = "d:/TablePdf.pdf"
//
//    private val catFont: Font = Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD)
//
//    private val redFont: Font = Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED)
//
//    private val subFont: Font = Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD)
//
//    private val smallBold: Font = Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD)
//
//    @kotlin.jvm.JvmStatic
//    fun main(args: Array<String>) {
//        try {
//            val document: Document = Document()
//            PdfWriter.getInstance(document, FileOutputStream(FILE))
//            document.open()
//            addMetaData(document)
//            addTitlePage(document)
//            addContent(document)
//            document.close()
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//    }
//
//    // iText allows to add metadata to the PDF which can be viewed in your Adobe
//    // Reader
//    // under File -> Properties
//    private fun addMetaData(document: Document) {
//        document.addTitle("My first PDF")
//        document.addSubject("Using iText")
//        document.addKeywords("Java, PDF, iText")
//        document.addAuthor("Lars Vogel")
//        document.addCreator("Lars Vogel")
//    }
//
//    @kotlin.Throws(DocumentException::class)
//    private fun addTitlePage(document: Document) {
//        val preface: Paragraph = Paragraph()
//        // We add one empty line
//        addEmptyLine(preface, 1)
//        // Lets write a big header
//        preface.add(Paragraph("Title of the document", catFont))
//
//        addEmptyLine(preface, 1)
//        // Will create: Report generated by: _name, _date
//        preface.add(
//            Paragraph(
//                "Report generated by: " + System.getProperty("user.name") + ", " + Date(),  //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
//                smallBold
//            )
//        )
//        addEmptyLine(preface, 3)
//        preface.add(Paragraph("This document describes something which is very important ", smallBold))
//
//        addEmptyLine(preface, 8)
//
//        preface.add(
//            Paragraph(
//                "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-).",
//                redFont
//            )
//        )
//
//        document.add(preface)
//        // Start a new page
//        document.newPage()
//    }
//
//    @kotlin.Throws(DocumentException::class)
//    private fun addContent(document: Document) {
//        var anchor: Anchor = Anchor("First Chapter", catFont)
//        anchor.setName("First Chapter")
//
//        // Second parameter is the number of the chapter
//        var catPart: Chapter = Chapter(Paragraph(anchor), 1)
//
//        var subPara: Paragraph? = Paragraph("Subcategory 1", subFont)
//        var subCatPart: Section = catPart.addSection(subPara)
//        subCatPart.add(Paragraph("Hello"))
//
//        subPara = Paragraph("Subcategory 2", subFont)
//        subCatPart = catPart.addSection(subPara)
//        subCatPart.add(Paragraph("Paragraph 1"))
//        subCatPart.add(Paragraph("Paragraph 2"))
//        subCatPart.add(Paragraph("Paragraph 3"))
//
//        // add a list
//        createList(subCatPart)
//        val paragraph: Paragraph = Paragraph()
//        addEmptyLine(paragraph, 5)
//        subCatPart.add(paragraph)
//
//        // add a table
//        createTableWithSummary(subCatPart)
//
//        //    createTable(subCatPart);
//
//        // now add all this to the document
//        document.add(catPart)
//
//        // Next section
//        anchor = Anchor("Second Chapter", catFont)
//        anchor.setName("Second Chapter")
//
//        // Second parameter is the number of the chapter
//        catPart = Chapter(Paragraph(anchor), 1)
//
//        subPara = Paragraph("Subcategory", subFont)
//        subCatPart = catPart.addSection(subPara)
//        subCatPart.add(Paragraph("This is a very important message"))
//
//        // now add all this to the document
//        document.add(catPart)
//    }
//
//    @kotlin.Throws(BadElementException::class)
//    private fun createTable(subCatPart: Section) {
//        val table: PdfPTable = PdfPTable(3)
//
//        // t.setBorderColor(BaseColor.GRAY);
//        // t.setPadding(4);
//        // t.setSpacing(4);
//        // t.setBorderWidth(1);
//        var c1: PdfPCell = PdfPCell(Phrase("Table Header 1"))
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER)
//        table.addCell(c1)
//
//        c1 = PdfPCell(Phrase("Table Header 2"))
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER)
//        table.addCell(c1)
//
//        c1 = PdfPCell(Phrase("Table Header 3"))
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER)
//        table.addCell(c1)
//        table.setHeaderRows(1)
//
//        table.addCell("1.0")
//        table.addCell("1.1")
//        table.addCell("1.2")
//        table.addCell("1.3")
//        table.addCell("2.1")
//        table.addCell("2.2")
//
//        subCatPart.add(table)
//    }
//
//    @kotlin.Throws(DocumentException::class)
//    private fun createTableWithSummary(subCatPart: Section) {
//        val headers = arrayOf("Code", "Name", "Qty", "Price", "Total Price")
//        val data1 = arrayOf(
//            arrayOf("1.1.2", "View", "1", "4.22", "4.22"), arrayOf("1.3.4", "Cover", "1", "1.2", "1.2"),
//            arrayOf("2.30.3", "Install private static void createMyTable(Section subCatPart) throws DocumentException", "1", "1.52", "1.52"),
//        )
//        val columnWidths1 = floatArrayOf(30f, 110f, 20f, 20f, 20f)
//        val columnAlignments1 = intArrayOf(Element.ALIGN_CENTER, Element.ALIGN_LEFT, 1, 1, 1)
//
//        var table: PdfPTable = PdfPTable(5)
//        table.setWidths(columnWidths1)
//
//        for (i in headers.indices) {
//            val c1: PdfPCell = PdfPCell(Phrase(headers[i]))
//            c1.setHorizontalAlignment(columnAlignments1[i])
//            table.addCell(c1)
//        }
//
//        for (i in 0..2) {
//            for (j in 0..4) {
//                val c1: PdfPCell = PdfPCell(Phrase(data1[i][j]))
//                c1.setHorizontalAlignment(columnAlignments1[j])
//                table.addCell(c1)
//            }
//        }
//        subCatPart.add(table)
//
//        val summaryCells = Map.of("Amount:", "1100", "Discount:", "0%", "Total amount with discount:", "1100")
//
//        val summaryColumnWidths = floatArrayOf(180f, 20f)
//        val summaryColumnAlignments = intArrayOf(Element.ALIGN_LEFT, Element.ALIGN_CENTER)
//        table = PdfPTable(2)
//        table.setWidths(summaryColumnWidths)
//
//        for ((key, value) in summaryCells) {
//            var c1: PdfPCell = PdfPCell(Phrase(key))
//            c1.setHorizontalAlignment(summaryColumnAlignments[0])
//            table.addCell(c1)
//            c1 = PdfPCell(Phrase(value))
//            c1.setHorizontalAlignment(summaryColumnAlignments[1])
//            table.addCell(c1)
//        }
//        subCatPart.add(table)
//    }
//
//    private fun createList(subCatPart: Section) {
//        val list: List = List(true, false, 10)
//        list.add(ListItem("First point"))
//        list.add(ListItem("Second point"))
//        list.add(ListItem("Third point"))
//        subCatPart.add(list)
//    }
//
//    private fun addEmptyLine(paragraph: Paragraph, number: Int) {
//        for (i in 0 until number) {
//            paragraph.add(Paragraph(" "))
//        }
//    }
}