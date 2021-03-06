package br.com.user.api.controller.resource

import org.apache.commons.lang3.StringUtils

class GithubResource {
    var login: String = StringUtils.EMPTY
    var id: String = StringUtils.EMPTY
    var htmlUrl: String? = null
    var name: String? = null
    var company: String? = null
    var location: String? = null
    var bio: String? = null
    var followers: String? = null
    var following: String? = null
    var avatarUrl: String? = null
    var createdAt: String? = null
}