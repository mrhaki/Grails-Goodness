// Original criteria builder.
def list = Domain.withCriteria {
    ilike 'title', 'Groovy%'
    le 'postedDate', new Date()
}

// Refactor
def list2 = Domain.withCriteria {
    title delegate, 'Groovy%'
    alreadyPosted delegate
}

private void title(builder, String query) {
    builder.ilike 'title', query
}

private void alreadyPosted(builder) {
    builder.le 'postedDate', new Date()
}
