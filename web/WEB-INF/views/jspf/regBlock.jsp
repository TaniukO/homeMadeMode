<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<main class="content">
            <section>
                <article>
                    <h1>Регистрация</h1>
                    <div class="text-article">
                        <form method="POST" action="/regServlet">
                        <p>
                            <label for="login">Логин</label>
                            <input type="text" name="login" id="login"/>
                        </p>
                        <p>
                        <label for="email">E-Mail</label>
                        <input type="email" name="email" id="email"/>
                        </p>
                        <p>
                        <label for="password">Пароль</label>
                        <input type="password" name="password" id="password"/>
                        
                        <label for="password2">Повторіть пароль</label>
                        <input type="password" name="password2" id="password2"/>
                        </p>
                        <p>
                            <button type="submit">Зарегистрироваться</button>
                        </p>
                        </form>
                    </div>
                </article>
            </section>
	</main>