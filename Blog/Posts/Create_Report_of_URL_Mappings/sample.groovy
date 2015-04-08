| URL Mappings Configured for Application
| ---------------------------------------

Dynamic Mappings
 |    *     | /${controller}/${action}?/${id}?(.${format)?              | Action: (default action)      |
 |    *     | /                                                         | View:   /index                |

Controller: dbdoc
 |    *     | /dbdoc/${section}?/${filename}?/${table}?/${column}?      | Action: (default action)      |

Controller: error
 |    *     | ERROR: 500                                                | Action: (default action)      |
 |    *     | ERROR: 404                                                | Action: notFound              |

Controller: upload
 |    *     | /upload                                                   | Action: {POST=file}           |

Controller: user
 |   GET    | /api/users                                                | Action: index                 |
 |   GET    | /api/users/create                                         | Action: create                |
 |   POST   | /api/users                                                | Action: save                  |
 |   GET    | /api/users/${id}                                          | Action: show                  |
 |   GET    | /api/users/${id}/edit                                     | Action: edit                  |
 |   PUT    | /api/users/${id}                                          | Action: update                |
 |  DELETE  | /api/users/${id}                                          | Action: delete                |
