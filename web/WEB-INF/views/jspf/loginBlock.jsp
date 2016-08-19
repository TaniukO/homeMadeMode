<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<main class="content">
            <section>
                <article>
                    <h1>Вход</h1>
                    <div class="text-article">
                        <form method="POST" action="/loginServlet">
                        <table>
						<tr>
				<td><label for="login">Логин или E-Mail</label></td>
				<td><input type="text" name="login" id="login"/></td>
						</tr>
						<tr>
							<td><label for="password">Пароль</label></td>
							<td><input type="password" name="password" id="password"/></td>
						</tr>
						<tr>
							<td><a href="/reg">Зареєструватись</a></td>
							<td><button type="submit">Вход</button></td>
						</tr></table>
                        </form>
                    </div>
                </article>
            </section>
	</main>