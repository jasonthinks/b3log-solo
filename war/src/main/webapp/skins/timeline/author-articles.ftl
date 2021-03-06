<#include "macro-head.ftl">
<!DOCTYPE html>
<html>
    <head>
        <@head title="${authorName} - ${blogTitle}">
        <meta name="keywords" content="${metaKeywords},${authorName}"/>
        <meta name="description" content="<#list articles as article>${article.articleTitle}<#if article_has_next>,</#if></#list>"/>
        </@head>
    </head>
    <body>
        ${topBarReplacement}
        <#include "header.ftl">
        <h2 class="nav-abs">
            <img style="border-radius: 45px;" width="90" title="${authorName}" src="${authorThumbnailURL}"/>
            <br/>
            ${authorName}
        </h2>
        <#include "article-list.ftl">
        <#include "footer.ftl">
    </body>
</html>
