package param.date

import org.junit.Test

class SampleControllerTests extends GroovyTestCase {

    @Test
    void testDateParameters() {
        def controller = new SampleController()

        // Set request parameters.
        def params = [
                defaultFormatDate: inputDateTime.format('yyyy-MM-dd HH:mm:ss.S'),
                defaultFormatNameDate: inputDateTime.format('yyyy-MM-dd'),
                singleFormatDate: inputDateTime.format('yyyyMMdd'),
                multipleFormatsDate1: inputDateTime.format('yyyy-MM-dd'),
                multipleFormatsDate2: inputDateTime.format('yyyyMMdd')
        ]
        controller.request.parameters = params

        def model = controller.index()

        assertDates inputDateTime, model.defaultFormatDate
        assertDates inputDate, model.defaultFormatNameDate
        assertDates inputDate, model.singleFormatDate
        assertDates inputDate, model.multipleFormatsDate1
        assertDates inputDate, model.multipleFormatsDate2
    }

    private void assertDates(final Date expected, final Date controllerDate) {
        assertEquals expected.toGMTString(), controllerDate.toGMTString()
    }

    /**
     * Create Date object for January 10, 2012 14:12:01.120
     */
    private Date getInputDateTime() {
        final Calendar cal = Calendar.instance
        cal.updated(year: 2012, month: Calendar.JANUARY, date: 10, 
                    hours: 14, minutes: 12, seconds: 1, milliSeconds: 120)
        cal.time
    }

    private Date getInputDate() {
        final Date inputDateTime = inputDateTime
        inputDateTime.clearTime()
        inputDateTime
    }
}
